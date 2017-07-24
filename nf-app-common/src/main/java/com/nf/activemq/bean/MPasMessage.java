package com.nf.activemq.bean;

import java.io.Serializable;
import java.util.Map;

public class MPasMessage implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1389731754194906466L;
	
	private String jmsType;
	private String msgID;

	private String type;
	private String tag;
	private String alias;
	private String aliasType;
	private String czxt;
	private String startTime;
	private String alert;
	private Map<String, String> params;
	
	public String getJmsType() {
		return jmsType;
	}

	public void setJmsType(String jmsType) {
		this.jmsType = jmsType;
	}

	public String getMsgID() {
		return msgID;
	}

	public void setMsgID(String msgID) {
		this.msgID = msgID;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAliasType() {
		return aliasType;
	}

	public void setAliasType(String aliasType) {
		this.aliasType = aliasType;
	}

	public String getAlert() {
		return alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}

	public String getCzxt() {
		return czxt;
	}

	public void setCzxt(String czxt) {
		this.czxt = czxt;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
