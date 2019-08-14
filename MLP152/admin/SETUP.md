# This readme is for the administrators of the Maverick program

## Prior start of the batch

  * Sort the teams into 2 batches of 25, then into teams of 5 each
    * CS/Non-CS folks
    * Scores equally distributed
    * Gender distribution
  * Create  repository for the 10 teams
    * Make sure that MLP-fork-me does not have any branches
    * Go to https://635681506020.signin.aws.amazon.com/console.com
      * create a group for each team : MLPnn
      * create a repository for each team : MLPnn
        * Add MLP-Admins as a group w/ Admin access, and MLPnn team w/ R/W to these repositories
    * `git clone --bare ssh://git-codecommit.us-east-2.amazonaws.com/v1/repos/MLP72`
    * 'cd MLP72`
    * For each team, nn = 01 to 10
      * `git push --mirror ssh://git-codecommit.us-east-2.amazonaws.com/v1/repos/MLPnn.git`
    * For each team, nn = 01 to 10
      * from the workspace
      * For windows
        * `git clone ssh://git-codecommit.us-east-2.amazonaws.com/v1/repos/MLPnn.git`
        * cd MLPnn
        * use VS Code, find/replace in files to do the following: replacing MLP72 -> MLPnn, MLP72 -> MLPnn
        * Rename directory restservice/CMS/src/main/java/com/hexaware/MLP72/ to restservice/CMS/src/main/java/com/hexaware/MLPnn/
      * For Mac OS; replace nn with the team-id in the following three commands; use xxnn.sh
        * `git clone ssh://git-codecommit.us-east-2.amazonaws.com/v1/repos/MLPnn.git`
        * `cd MLPnn`      
        * `find . -type f -not -path '*/\.*' -not -path "*/node_modules/*" -exec sed -i '' -e 's/MLP72/MLP[nn]/g' {} \; -exec sed -i '' -e 's/MLP72/MLP[nn]/g' {} \;`
        * `mv restservice/CMS/src/main/java/com/hexaware/MLP72/ restservice/CMS/src/main/java/com/hexaware/MLP[nn]/`
        * `mv restservice/CMS/src/test/java/com/hexaware/MLP72/ restservice/CMS/src/test/java/com/hexaware/MLP[nn]/`
        * `mv restservice/integration-test/src/test/java/com/hexaware/MLP72 restservice/integration-test/src/test/java/com/hexaware/MLP[nn]`
      * `git add restservice/CMS/src/main/java/com/hexaware/MLP[nn]/ restservice/CMS/src/test/java/com/hexaware/MLP[nn]/ restservice/integration-test/src/test/java/com/hexaware/MLP[nn]`
      * `git commit -a -m "replacing xx with the team number"`
      * `git push origin HEAD`
      * `git clean -f`
      
    * Add the .pub key from jenkins home/.ssh directory for this team as the repository's deploy key
    * [TBD: This has to be done on day1] Add each team member to the team's git repository
  * Create Scrum teams corresponding to the 10 teams
    * Add each team member to the team's GITHUB Project Board group 


# Week #1 Day #1
  * Go to https://console.aws.amazon.com/codecommit,  and clone the repo through GitBash 
  

## Setup Trello Project Board

The users are expected to login  through {Hexaware-id}-.hexaware@gmail.com id at Trello 

Create a "MLP72" as project board and add users through add members link at Trello board

Create Sprint Backlog as list and include various tasks as cards
Assign each task to members (add member button) with due date mentioned  
