Feature: popular show title and duration to a file. 

  @AllShows
  Scenario Outline: adding title and duration of  popular show  to a file. 
    Given application <url>
    Then verify that home page is displayed.
    And Scroll down to popular shows
    And Navigate to the last video by pressing the icon “>” 
    Then Once you reach the last video, click on EXPLORE THE SHOW
    And click on “SHOW MORE”  til last page  and write all the show titles and duration into it.
    
    
    Examples:
    |url| |new_file|
    |"https://go.discovery.com/"||"i am considering now Report folder, we can pass as argument as well "|
    
    
