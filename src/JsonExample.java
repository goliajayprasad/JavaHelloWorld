
public class JsonExample {
	
	public static void main(String[] args) {
		
		String jsonDataString = "{\"results\":[{\"lat\":\"value\",\"lon\":\"value\" }, { \"lat\":\"value\", \"lon\":\"value\"}]}";
		JSONObject mainObject = new JSONObject(jsonDataString);
		JSONObject valuesObject = new JSONObject();
		JSONArray list = new JSONArray();
		valuesObject.put("lat", "newValue");
		valuesObject.put("lon", "newValue");
		valuesObject.put("city", "newValue");
		valuesObject.put("street", "newValue");
		valuesObject.put("date", "newValue");
		valuesObject.put("time", "newValue");
		list.put(valuesObject);
		mainObject.accumulate("values", list);
		System.out.println(mainObject);
	}

}
