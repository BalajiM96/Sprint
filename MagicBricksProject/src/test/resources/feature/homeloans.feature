
Feature: To check the Eligibility of home loan and calculate emi of the user
  
  Background: User Is Able To LogIn Using Valid Details
  	Given User Is On Landing Page
  	When User Able To Go On Login Page
  	And User Is Able To Enter Mobile No or Email ID
  	Then User Is On Next Page
  	
  @HomeLoan
  Scenario: Checking the user salary is eligible
  	Given User Is On Next Page1
  	When User is able to move to home loan page
  	And User is able to be enter the salary 
  	And User is click the eligibility button
  	Then Check the status of the user 
   
#	@LoanAgainstPropertyWithoutCo
#	Scenario: User is able to enter the details without co-applicant
#		Given User Is On Next Page2
#		When User is able to move to the loan against property page and eligible for the loan1
#		And User is able to enter general details
#		And User is able to enter profile details
#		And User is able to enter income details
#		Then Check the user is able to eligible for the loan without co-applicant
#		
#	@LoanAgainstPropertyWithCo
#	Scenario: User is able to enter the details with co-applicant
#		Given User Is On Next Page3
#		When User is able to move to the loan against property page and eligible for the loan2
#		And User is able to enter general details2
#		And User have to click yes for co-applicant
#		And User is able to enter details of co-applicant
#		And User is able to enter income of co-applicant
#		Then Check the user is able to eligible for the loan with co-applicant
#		
#	@HomeLoanInterestRate
#	Scenario: User is able to calculate emi
#		Given User Is On Next Page4
#		When User is able to move to the Home loan interest rate page 
#		And User is able to enter the details and click the calculate your EMI button
#		Then User is able to get the repayment details

  #@HomeLoanRepaymentOutline
  #Scenario Outline: Calculate the Home Loan Repayment
#		Given User must be logged in
    #When User entered the homepage 
    #And moves to home loan repayment page  
    #And User must enter the <Loan Amount>, <Tenure>, <Rate of interest>, <Installment paid>, <Prepayment Amount>
    #And After entering all the details User need to click the calculate button
    #Then Check the amount to be saved
#
    #Examples: 
      #| Loan Amount  | Tenure | Rate of interest  | Installment paid | Prepayment Amount | 
      #| "1000000" 		|  "15"  | "12" 						 | "20" 						| "100000" 	|
      #| "1500000" 		|  "10"  | "13" 						 | "25" 						| "200000"	|
      #| "2000000" 		|  "20"  | "14" 						 | "30" 						| "250000"	|
      #| "2500000" 		|  "25"  | "15" 						 | "35" 						| "300000"	|
      #| "3000000" 		|  "30"  | "16" 						 | "40" 						| "350000"	|
