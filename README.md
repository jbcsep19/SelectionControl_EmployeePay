# Calculate employee's pay
## Prompt
A program is required by a company to read an employee’s number, pay rate and the number of hours worked in a week. The program is then to validate the pay rate field and the hours worked field and, if valid, compute the employee’s weekly pay and then print it and the input data.

Validation: According to the company’s rules, the maximum hours an employee can work per week is 60 hours, and the maximum hourly rate is $25.00 per hour. If the hours worked field or the hourly rate field is out of range, the input data and an appropriate message are to be printed and the employee’s weekly pay is not to be calculated.

Weekly pay calculation: Weekly pay is calculated as hours worked times pay rate. If more than 35 hours are worked, payment for the overtime hours worked is calculated at time-and-a-half.

## Pseudocode


<pre>
Module Main
	// declare variables
	Declare Integer employeeNum
	Declare Real payRate
	Declare Real hrWorked
	Constant Real MAX_HRLY_RATE = 25.00
	Constant Real MAX_HR_ALLOWED = 60
	Declare Real wklyPay
	
	// get values
	Display "Please enter the employee's number: "
	Input employeeNum
	Display "Please enter the employee's pay rate: "
	Input payRate
	Display "Please enter the number of hours worked in the week: "
	Input hrWorked

	// validate whether pay rate and hours worked are in range
	If(payRate <= MAX_HRLY_RATE && hrWorked <= MAX_HR_ALLOWED) Then
		// calculate weekly pay
		If(hrWorked <= 35) Then
			Set wklyPay = hrWorked * payRate
		Else
			Set wklyPay = 35 * payRate + ((hrWorked-35) * (payRate*1.5))
		
		Display "The weekly pay for recorded hours of ", hrWorked, " is $", wklyPay
	
	Else
		Display "ERROR: The values you entered is out of range."
		Display "Employee's weekly pay cannot be calculated at this time."

	Display "The employee's number is ", employeeNum
	Display "The pay rate is ", payRate
	Display "The number of hours worked in a week is ", hrWorked
End Main
</pre>
