Pseudocode - Calculate employee's pay

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
