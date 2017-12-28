package cn.et.work.entity;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private int id;
	private String text;
	private String state="closed";
	private List<TreeNode> deptsList=new ArrayList<TreeNode>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public List<TreeNode> getDeptsList() {
		return deptsList;
	}
	public void setDeptsList(List<TreeNode> deptsList) {
		this.deptsList = deptsList;
	}
	
	
}
