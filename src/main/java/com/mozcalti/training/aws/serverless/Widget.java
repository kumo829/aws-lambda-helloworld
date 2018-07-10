package com.mozcalti.training.aws.serverless;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName="Widget")
public class Widget {

	@DynamoDBHashKey(attributeName="id")
	private String id;
	@DynamoDBAttribute(attributeName="name")
	private String name;

	public Widget() {
	}

	public Widget(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ \"id\":\"" + id + "\", \"name\":\"" + name + "\"}";
	}
}
