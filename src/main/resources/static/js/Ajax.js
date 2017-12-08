function Login() {
    var txt = document.getElementById('column');
    var str = txt.innerHTML = "login start";
    var loginbtn = document.getElementsByTagName('a')[0];
    $.ajax({
        type: "GET",
        url: "/Im",
        async: true,
        datatype: "json",
        success: function (data) {
            if (data) {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            } else {
                txt.innerHTML = str + "<br>" + "login failed";
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}