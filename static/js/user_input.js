var user_input = null;


processUserInput = function ()
{

	var x = document.getElementById("var-x").value;
	var y = document.getElementById("var-y").value;
	var z = document.getElementById("var-z").value;
	var a = document.getElementById("var-a").value;
	var b = document.getElementById("var-b").value;
	var c = document.getElementById("var-c").value;
	var d = document.getElementById("var-d").value;


	if (x === null) {
		x = 0;
	}

	if (y === null) {
		y = 0;
	}

	if (z === null) {
		z = 0;
	}

	if (a === null) {
		a = 0;
	}

	if (b === null) {
		b = 0;
	}

	if (c === null) {
		c = 0;
	}

	if (d === null) {
		d = 0;
	}

	var turn1 = getTurnInput("turn1");
	var turn2 = getTurnInput("turn2");
	var turn3 = getTurnInput("turn3");
	var turn4 = getTurnInput("turn4");
	var turn5 = getTurnInput("turn5");
	var turn6 = getTurnInput("turn6");


	
	console.log(turn1);
	console.log(turn2);

	switch(turn1) {
		case "one":
			turn1 = 1;
			break;
		case "two":
			turn1 = 2;
			break;
		case "three":
			turn1 = 3;
			break;
		default:
			turn1 = 0;
	}

	switch(turn2) {
		case "one":
			turn2 = 1;
			break;
		case "two":
			turn2 = 2;
			break;
		case "three":
			turn2 = 3;
			break;
		default:
			turn2 = 0;
	}

	switch(turn3) {
		case "one":
			turn3 = 1;
			break;
		case "two":
			turn3 = 2;
			break;
		case "three":
			turn3 = 3;
			break;
		default:
			turn3 = 0;
	}

		switch(turn4) {
		case "one":
			turn4 = 1;
			break;
		case "two":
			turn4 = 2;
			break;
		case "three":
			turn4 = 3;
			break;
		default:
			turn4 = 0;
	}

		switch(turn5) {
		case "one":
			turn5 = 1;
			break;
		case "two":
			turn5 = 2;
			break;
		case "three":
			turn5 = 3;
			break;
		default:
			turn5 = 0;
	}

	switch(turn6) {
		case "one":
			turn6 = 1;
			break;
		case "two":
			turn6 = 2;
			break;
		case "three":
			turn6 = 3;
			break;
		default:
			turn6 = 0;
	}


	var varArray = [x, turn1, y, turn2, z, turn3, a, turn4, b, turn5, c, turn6, d];

    settings = {'vars': []};
    localStorage.setItem('turtleGameVars', JSON.stringify(varArray));
}

function getTurnInput(radioGroupName) {
    var choices = document.getElementsByName(radioGroupName);
    for (var i = 0, l = choices.length; i < l; i++)
    {
        if (choices[i].checked)
        {
            return choices[i].value;
        }
    }
}


	//if no username or password entered, error message
/*	if(username === "" || pc === "") {
		document.getElementById("message").innerHTML = "<p class='error'>Enter both a username and password please.</p>";
	} 
	//if no account type selected, error message
	else if (accountType === "") {
		document.getElementById("message").innerHTML = '<p class="error">Select an account type please.</p>';
	} 
	//if account is Farm, ensure there is an address that can be entered into Google maps
	else if ((street === "" || city === "" || state === "") && accountType === 'Farm') {
		document.getElementById("message").innerHTML = "<p class='error'>Please enter a full address for your farm or CSA pick-up location.<br>This information is provided to your subscibers in an interactive map.</p>";
	} 
	//if subscriber account, ensure there is an email address entered
	else if (subEmail === "" && accountType === 'Subscriber') {
		document.getElementById("message").innerHTML = "<p class='error'>Email required to link your account with your CSA.</p>";
	} 
	//make sure that zip code is within appropriate range
	else if (zip > 99999 || zip < 0) {
		document.getElementById("message").innerHTML = "<p class='error'>Please enter a valid 5-digit zipcode.</p>";
	} 
	//passed all error checking at the browser level, so start AJAX.  If server sends error messages, they will show in the same html element as above.
	else {
		var xhr = new XMLHttpRequest();
		if (!xhr) {
	        throw 'Unable to create HttpRequest.'; // you're using a horrible browser
	    }

	    xhr.open("POST", "newuser.php", true);
	    xhr.setRequestHeader("Content-type", "application/x-www-form-urlencoded");
		xhr.send(params);
		 
		xhr.onreadystatechange = function ()
		{
		    if (xhr.readyState==4 && xhr.status==200)  
		    {
		        document.getElementById("message").innerHTML = xhr.responseText;
		    }
		}
	}*/