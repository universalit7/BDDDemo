
  Feature: Kind of Ads feature from YouTube
    As a user who needs to reach to watch my desire video.
    so that i can aware of some knowledge.

    Scenario: Skipped Ads  in YouTube
      Given link video has Ads
      And luckily it has skipped button with contain secs of time
      When i need to watch a desire video
      And Click on skipped button
      Then Continued to watch that video without waiting

      Scenario: Without Skipped Ads in YouTube
        Given link video has Ads
        And with 2 of 2 Ads which will take time
        When i should watch a desire video
        And have to wait until Ads finish for the video
        Then  proceed to watch

        Scenario: Received Text Ads in YouTube
          Given link video has Ads
          When need to watch a desire video
          And there lot of received Text Ads
          Then click on close sign
          And The video should have clear to watch


