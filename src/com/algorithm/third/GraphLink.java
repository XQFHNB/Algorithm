package com.algorithm.third;

/**
 * Created by XQF on 2016/12/19.
 */
class Vertex {

    private int key = 0; //顶点编号
    private String name = null;//顶点相关信息
    private Edge adj = null; //和自己的邻接顶点之间的那条边

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Edge getAdj() {
        return adj;
    }

    public void setAdj(Edge adj) {
        this.adj = adj;
    }
}

class Edge {

    private int dest = 0;//邻接顶点
    private int cost = 0;//权值
    private String infoEdge = null;//边信息
    private Edge link = null;//与这个顶点相关的所有边在邻接表中
    //的下一条边

    public int getDest() {
        return dest;
    }

    public void setDest(int dest) {
        this.dest = dest;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getInfoEdge() {
        return infoEdge;
    }

    public void setInfoEdge(String infoEdge) {
        this.infoEdge = infoEdge;
    }

    public Edge getLink() {
        return link;
    }

    public void setLink(Edge link) {
        this.link = link;
    }
}

public class GraphLink {

    private int maxVertices; //图中最大顶点数
    private int numEdges; //当前边数
    private int numVertices;
    private Vertex[] NodeTable = null;

    public GraphLink(int size) {
        //构造函数：建立一个空的邻接表
        maxVertices = size;
        numVertices = 0;
        numEdges = 0;
        NodeTable = new Vertex[maxVertices]; //创建顶点表数组
        if (NodeTable == null) {
            System.out.println("GraphLink is failed to create");
            System.exit(1);
        }
        for (int i = 0; i < maxVertices; i++)
            NodeTable[i].setAdj(null);

    }

    public void Destroy() {
        //析构函数：删除一个邻接表
        for (int i = 0; i < numVertices; i++) {
            Edge p = NodeTable[i].getAdj();
            while (p != null) {
                NodeTable[i].setAdj(p.getLink());
                p = NodeTable[i].getAdj();
            }
        }
    }

    public int getVertexPos(int vertx) {
        //给出顶点vertex在图中的位置
        for (int i = 0; i < numVertices; i++)
            if (NodeTable[i].getKey() == vertx)
                return i;
        return -1;
    }

    public int getValue(int i) { //取顶点 i 的值
        return (i >= 0 && i < numVertices) ? NodeTable[i].getKey() : 0;
    }

    public int getFirstNeighbor(int v) {
        //给出顶点位置为 v 的第一个邻接顶点的位置,
        //如果找不到, 则函数返回-1
        if (v != -1) {
            //顶点v存在
            Edge p = NodeTable[v].getAdj(); //对应边链表第一个边结点
            if (p != null) {
                //存在, 返回第一个邻接顶点
                return p.getDest();
            }
        }
        return -1; //第一个邻接顶点不存在
    }

    public int getNextNeighbor(int v, int w) {
        //给出顶点v的邻接顶点w的下一个邻接顶点的位置,
        //若没有下一个邻接顶点, 则函数返回-1
        if (v != -1) { //顶点v存在
            Edge p = NodeTable[v].getAdj();
            while (p != null && p.getDest() != w)
                p = p.getLink();
            if (p != null && p.getLink() != null) {
                //返回下一个邻接顶点
                return p.getLink().getDest();
            }
        }
        //下一邻接顶点不存在
        return -1;
    }

    public void printGraph() {
        for (int i = 0; i < maxVertices; i++) {

        }

    }

    public static void main(String[] args) {

    }

}