This Project is a solution for the displaying the top ten hashtags in tweets. This solution accepts as input :
    
    1- First line containing the total Number of Tweets
    2- Second line onwards the individual tweet inputs
It then displays the top ten hashtags mentioned in the input tweets in descending order of their counts
    
    Example:
      Input:
        12
        #MSD was one of the biggest stars in Indian Cricket
        #Ganguly had a big role to play in the career of #MSD
        #Sachin is the one who pushed for handing captaincy to #MSD after #Dravid
        #Dravid as deputy and #Ganguly as skipper had seen through the toughest days for Indian Cricket
        #VVS , #Dravid , #Zaheer, #Kumble , #Sachin and #Ganguly were stars of the 90s Indian Cricket
        #Sehwag as an explosive opener was another brilliant masterstroke by #Ganguly
        #MSD won all the three coveted trophies of international cricket
        #Virat and #Rohit are the current young turks who will carry the legacy of #MSD into the future
        #Dravid has been playing a key role in mentoring and developing the next generation stars for India
        #Dravid and #Ganguly have now taken forward their partnership from cricket to administration
        With #MSD retiring, #Rishabh has to fill in big boots
        Indian Cricket will be indebted to #MSD for his contributions and achievements
   
      Output:
        #MSD
        #Ganguly
        #Dravid
        #Sachin
        #VVS
        #Zaheer,
        #Kumble
        #Sehwag
        #Virat
        #Rohit
      
      Explanation:
        In the input tweets, the first line represents the input size, i.e. 10 tweets and the next 10 lines represent the input tweets. The count of the hashtags mentioned 
        in the tweets are:
            {#MSD=7, #Ganguly=5, #Dravid=5, #Sachin=2, #VVS=1, #Zaheer,=1, #Kumble=1, #Sehwag=1, #Virat=1, #Rohit=1, #Rishabh=1}
        and so the input is displayed as in the response.
        
 Project Structure:
 
    src
        |_ _ _ com.techmojo.freshteam.coding.task
                |_ _ _ TopTenTrendingHashtags.java (Solution)
    SampleTestCases
        |_ _ _ TestCase1
                |_ _ _ TestCase2
                |_ _ _ TestCase3
                |_ _ _ Response_TestCase1
                |_ _ _ Response_TestCase2
                |_ _ _ Response_TestCase3
 
                                                             
                                                                
      
