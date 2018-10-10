package com.tcs.demo;

public class SplitUtil {

	public static void main(String[] args) {
		String input = 
				"JsonSchemaValidationException: Json content is not compliant with schema" +
				"com.github.fge.jsonschema.core.report.ListProcessingReport: failure" +
				"--- BEGIN MESSAGES ---" +
				"error: object has missing required properties ([\"lastName\"])" +
				"level: \"error\"" +
				"schema: {\"loadingURI\":\"file:/D:/Laptop_Backup/AllWrkSpace/BHPMule/.mule/apps/replace_value_in_json/classes/schema/fstab.json#\",\"pointer\":\"\"}"+
				"instance: {\"pointer\":\"\"}"+
				"domain: \"validation\""+
				"keyword: \"required\""+
				"required: [\"firstName\",\"id\",\"lastName\"]"+
				"missing: [\"lastName\"]"+
				"---  END MESSAGES  ---";
		
		String[] arrOfStr = input.split("error: ");
		String[] arrOfStr1 = arrOfStr[1].split("level: ");
		
		for (String a : arrOfStr1) {
		//for (int index=0; index : arrOfStr) {
            System.out.println("<" + a + ">"); 
		}
		
	}
}
