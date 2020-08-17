package com.techmojo.freshteam.coding.task;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/*			Solution for displaying top ten hashtags in input tweets
 * 		@author : Abhijeet Tripathy<tripathyabhijeet72@gmail.com>
 * 		
 * This solution accepts as input:
 * 		1- Total number of Tweets in input
 * 		2- Tweet inputs in following lines
 * 
 * Example: 
 * 1
 * This is a sample #Tweet
 * 
 * The top ten hashtags mentioned in the input tweets are then displayed in decreasing order. For
 * the above sample input, response will be:
 * #Tweet
 *  
 */
public class TopTenTrendingHashtags {
	
	// LinkedHashMap is used as a data structure to store the hashtags and their counts
	static Map<String,Integer> hashTagsCount= new LinkedHashMap<String,Integer>();;
	
	
	/* This method adds the hash tags to the existing data structure based on whether the hashtag
	* is already present in the data structure. 
	* Input : Array of string containing hashtags in Input Tweet
	* Output: None
	*/
	public static void addHashTagsCount(String[] hashTags) {
		for(String hashTag : hashTags) {
			Integer count = hashTagsCount.get(hashTag);
			hashTagsCount.put(hashTag, ((count == null)? 1:++count ));
		}
	}
	
	/* This method sorts the final Map data structure based on the number of tweets, i.e. Map 
	 * value. We use Java streams API to perform pipelined operation of converting the 
	 * LinkedHashMap as a key,value stream reverse sorted by its value and then finally we collect
	 * the resultant stream as a LinkedHashMap.
	 * 
	 * We are using LinkedHashMap to preserve the order  of the sorted key,value stream. 
	 */
	public static void sortHashTagsCount() {
		
		hashTagsCount = hashTagsCount.entrySet()
										.stream()
										.sorted((Map.Entry.<String,Integer>comparingByValue().reversed()))
										.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
										
		
	}
	/*
	 * This Method iterates and displays the first ten hashtags that appear in the final sorted 
	 * LinkedHashMap data structure. 
	 */
	public static void displayResult() {
		
		int i=0; 
		for(Map.Entry<String, Integer> entry : hashTagsCount.entrySet() ) {
			 System.out.println(entry.getKey());
			 i++;
			 if(i==10)
				 break;
			 
		 }
	}

	
	
	public static void main(String[] args) {
		// Initializing Scanner object to read input from std io
		Scanner sc = new Scanner(System.in);
		// Reading total number of tweets
		int totalTweets = Integer.parseInt(sc.nextLine());
		
		// Iterating through the next lines of Input Tweets
		int i=0;
		while(i<totalTweets) {
			i++;
			
			/*
			 *  Creating an Array of the input tweet (String), after tokenizing and filtering
			 *  hashtags only. This is done by converting the input string as a String Stream 
			 *  and performing a pipelined filter operation to store only the hashtags in the
			 *  resultant array.
			 */
			String[] hashTags =  Arrays.stream(sc.nextLine().split(" "))
														.filter(s->s.contains("#"))
														.toArray(String[] :: new);
			// Adding the hashtags received in input to data structure
			addHashTagsCount(hashTags);			
		}
		
		/*
		 *  Sorting the final data structure as per count after the complete input has been 
		 *  received.
		 */
		sortHashTagsCount();
		// Displaying the final response 
		displayResult();
		
		// Closing the scanner object
		sc.close();
	}
	
		

}
