

import java.util.*;

/**
 * @Description 树中距离之和：抄的
 * @url:https://leetcode-cn.com/problems/sum-of-distances-in-tree/solution/shou-hua-tu-jie-shu-zhong-ju-chi-zhi-he-shu-xing-d/
 * @Date 2020/10/06
 * @Created by gyj
 */
public class Solution {
    Map<Integer, List<Integer>> map = new HashMap<>();
    int[] distNum;
    int[] nodeNum;
    int[] ans;
    int N;
    public int[] sumOfDistancesInTree(int N, int[][] edges) {
        if(N==1 || edges==null || edges.length==0) {
            int[] ans = new int[1];
            return ans;
        }
        this.N = N;
        //构建邻接表
        for (int[] edge : edges){
            int from = edge[0];
            int to = edge[1];
            if (!map.containsKey(from)){
                map.put(from, new ArrayList<>());
            }
            if (!map.containsKey(to)){
                map.put(to, new ArrayList<>());
            }
            map.get(from).add(to);
            map.get(to).add(from);
        }
        //定义distSum[i]表示：节点i所在的子树中的节点到节点i的距离和
        distNum = new int[N];
        //定义nodeSum[i]表示：节点i所在的子树中的节点数
        nodeNum = new int[N];
        ans = new int[N];
        postOrder(0, -1);
        preOrder(0, -1);
        return ans;
    }

    private void preOrder(int root, int parent) {
        ans[root] = distNum[root];
        for (int node : map.get(root)){
            if (node == parent){
                continue;
            }
            distNum[node] = distNum[root] - 2 * nodeNum[node] + N;
            preOrder(node, root);
        }
    }

    private void postOrder(int root, int parent) {
        nodeNum[root] = 1;
        distNum[root] = 0;
        for (int node : map.get(root)){
            if (node == parent){
                continue;
            }
            postOrder(node, root);
            nodeNum[root] += nodeNum[node];
            distNum[root] += nodeNum[node] + distNum[node];
        }
    }
}