package com.carenow.spring.datajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memos")
public class Memo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MemoId")
	Integer MemoId;
	
	@Column(name = "RecepientType")
	String RecepientType;
	
	@Column(name = "RecepientId")
	String RecepientId;
	
	@Column(name = "SenderId")
	String SenderId;
	
	@Column(name = "SenderType")
	String SenderType;
	
	@Column(name = "Content")
	String Content;
	
	@Column(name = "memoDate")
	String memoDate;

	public String getMemoDate() {
		return memoDate;
	}

	public void setMemoDate(String MemoDate) {
		memoDate = MemoDate;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Integer getMemoId() {
		return MemoId;
	}

	public void setMemoId(Integer memoId) {
		MemoId = memoId;
	}

	public String getRecepientType() {
		return RecepientType;
	}

	public void setRecepientType(String recepientType) {
		RecepientType = recepientType;
	}

	public String getRecepientId() {
		return RecepientId;
	}

	public void setRecepientId(String recepientId) {
		RecepientId = recepientId;
	}

	public String getSenderId() {
		return SenderId;
	}

	public void setSenderId(String senderId) {
		SenderId = senderId;
	}

	public String getSenderType() {
		return SenderType;
	}

	public void setSenderType(String senderType) {
		SenderType = senderType;
	}
	
	
}
