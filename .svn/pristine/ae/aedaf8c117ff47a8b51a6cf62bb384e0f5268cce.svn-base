package com.Entity;

import org.json.JSONException;
import org.json.JSONObject;

public class Problem {

	private int problem_id;			//问题id
	private String title;			//问题标题
	private String content;			//问题内容
	private String answer;			//回答
	private String suggestion;		//建议方案
	
	private String cre_time;		//创建时间
	
	private String cust_tel;		//客服电话

	public Problem(JSONObject jsonObject,int i) {
		// TODO Auto-generated constructor stub
		
			try {
				if(i==0){
				this.title=jsonObject.getString("title");
				this.answer=jsonObject.getString("answer");
				this.problem_id=jsonObject.getInt("problem_id");
				if(jsonObject.has("content")){
					this.content=jsonObject.getString("content");
				}
				if(jsonObject.has("suggestion")){
					this.suggestion=jsonObject.getString("suggestion");
				}
				if(jsonObject.has("cre_time")){
					this.cre_time=jsonObject.getString("cre_time");
				}
				}
				
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public int getProblem_id() {
		return problem_id;
	}

	public void setProblem_id(int problem_id) {
		this.problem_id = problem_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}

	public String getCre_time() {
		return cre_time;
	}

	public void setCre_time(String cre_time) {
		this.cre_time = cre_time;
	}

	public String getCust_tel() {
		return cust_tel;
	}

	public void setCust_tel(String cust_tel) {
		this.cust_tel = cust_tel;
	}
	
	
}
