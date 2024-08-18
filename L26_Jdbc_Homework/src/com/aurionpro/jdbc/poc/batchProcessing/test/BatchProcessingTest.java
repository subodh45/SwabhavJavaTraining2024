package com.aurionpro.jdbc.poc.batchProcessing.test;
import com.aurionpro.jdbc.poc.batchProcessing.model.*;

public class BatchProcessingTest {
public static void main(String[] args) {
	
	BatchProcessingModel batchProcessing = new BatchProcessingModel();
	
	batchProcessing.getConnection();
	batchProcessing.GetDetails();
	//batchProcessing.batchMethod();
	
}
}
