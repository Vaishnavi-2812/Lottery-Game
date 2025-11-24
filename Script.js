function playGame() {
    let user = document.getElementById("userNum").value;
    let random = Math.floor(Math.random() * 10) + 1;

    if (user == "") {
        document.getElementById("result").innerHTML = "Enter a number!";
        return;
    }

    if (user == random) {
        document.getElementById("result").innerHTML = 
            "🎉 You WIN! Lucky number: " + random;
    } else {
        document.getElementById("result").innerHTML = 
            "❌ You lost! Winning number was " + random;
    }
}