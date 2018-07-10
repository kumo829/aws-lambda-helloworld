package com.mozcalti.training.aws.serverless;

import java.util.Collections;
import java.util.Map;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class RequestHandler implements
							com.amazonaws.services.lambda.runtime.RequestHandler<Map<String,String>, WidgetResponse>
							  {

	 @Override
	public WidgetResponse handleRequest(Map<String,String> input, Context context)  {
		LambdaLogger logger = context.getLogger();

		logger.log("Input: " + input);
//		logger.log("Querying Widet with id " + input.get("id"));
//
//		// AmazonDynamoDB client =
//		// AmazonDynamoDBClientBuilder.standard().withEndpointConfiguration(
//		// new EndpointConfiguration("https://dynamodb.us-east-2.amazonaws.com",
//		// "us-east-2")).build();
//
//		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.defaultClient();
//
//		logger.log("client: " + client);
//
//		DynamoDBMapper mapper = new DynamoDBMapper(client);
//		logger.log("mapper " + mapper);
//
//		Widget widget = mapper.load(Widget.class, input.get("id"));
//		context.getLogger().log("Widget: " + widget);
//
//		logger.log("Widget found  " + widget.getName());
//
		return WidgetResponse.builder().setStatusCode(200).setObjectBody(new Widget())
				.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & serverless"))
				.build();
	}

}
