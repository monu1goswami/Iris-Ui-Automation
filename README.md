# Iris-Ui-Automation
Problem on URL -"https://osa-web.t-cg.co.uk/qatest" is mentioned below in the screenshot taken is kind of self explanatory which is reflected in Console window.
![image](https://user-images.githubusercontent.com/67236766/216882191-60c1bb6f-286e-4ed9-ae8c-b66b95a9c463.png)
### Error : 
a) The /qatest label or link test is not visible in the first place on UI screen given likewise "News" link Test.

b) The second error which show in console when we do F12 to check the netwrok response we are getting below error.
Actual Error: "Access to fetch at 'https://pro-fapi-osa.t-cg.co.uk/api/schools/organisationId/news?markAsRead=false' from origin 'https://osa-web.t-cg.co.uk' has been blocked by CORS policy: Response to preflight request doesn't pass access control check: No 'Access-Control-Allow-Origin' header is present on the requested resource. If an opaque response serves your needs, set the request's mode to 'no-cors' to fetch the resource with CORS disabled."

### Solution: 
User for this URL should have Authenticated access and the /qatest link test should be displayed on UI to make it correct as per my understanding

### To Run the Code: 
Please copy the HTTPS link of the code repository and clone it on the machine using git clone Command.
Then export it to the IDE and Run the main class file as "Run as Java project"
It will start executing the script and will publish the report for the same in HTML format
