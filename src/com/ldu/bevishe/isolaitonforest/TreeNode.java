package com.ldu.bevishe.isolaitonforest;
//树的节点
import com.ldu.bevishe.util.Print;

import static com.ldu.bevishe.util.Print.*;

public class TreeNode {
    private TreeNode lchild;
    private TreeNode rchild;
    private TreeNode sibling;

    private int dataId;
    private int attrId;
    private int depth;
    private double splitValue;

    public TreeNode(){
        this.lchild=null;
        this.rchild=null;
        this.sibling=null;
    }

    public void setIreeNode(int dataId,int attrId,int depth){
        this.dataId = dataId;
        this.attrId = attrId;
        this.depth = depth;
    }

    //添加右孩子
    public void addLChild(TreeNode lchild){
        this.lchild = lchild;
    }

    //添加左孩子
    public void addRChild(TreeNode rchild){
        this.rchild=rchild;
    }

    //添加兄弟节点
    public void addSibling(TreeNode sibling){
        this.sibling = sibling;
    }

    public TreeNode getLchild() {
        return lchild;
    }

    public TreeNode getRchild() {
        return rchild;
    }

    public TreeNode getSibling() {
        return sibling;
    }

    public int getDataId() {
        return dataId;
    }

    public int getAttrId() {
        return attrId;
    }

    public int getDepth() {
        return depth;
    }

    public double getSplitValue() {
        return splitValue;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public void setAttrId(int attrId) {
        this.attrId = attrId;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public void setSplitValue(double splitValue) {
        this.splitValue = splitValue;
    }
}
