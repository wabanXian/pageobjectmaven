function Login() {
    var txt = document.getElementById('column');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[0];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/Im",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>"+data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}

function orderllogin() {

}