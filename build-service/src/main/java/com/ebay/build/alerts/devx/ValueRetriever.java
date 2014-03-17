package com.ebay.build.alerts.devx;

public class ValueRetriever {
	
	private final Collections collections;
	
	public ValueRetriever(Collections c) {
		this.collections = c;
	}
	
	public String getValue(String collectionName, String fieldName) {
		for (Collection collection : collections.getCollections()) {
			if (collectionName.equals(collection.getName())) {
				for (Field field : collection.getFields()) {
					if (fieldName.equals(field.getName())) {
						if (field.getValue() == -1) {
							return "N/A";
						} else {
							if (field.getName().contains("Reliability")) {
								return field.getValue() + "%";
							} else {
								return field.getValue() + " min";
							}
						}
					}
				}
			} else {
				continue;
			}
		}
		return "N/A";
	}
}
