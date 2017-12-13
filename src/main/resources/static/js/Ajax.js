function Login() {
    var txt = document.getElementById('column');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[0];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/Login",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>" + data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}

function loginorder() {
    var txt = document.getElementById('column');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[1];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/loginorder",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>" + data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}

function orderlogin() {
    var txt = document.getElementById('column');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[2];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/orderlogin",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>" + data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}

function msitelogin() {
    var txt = document.getElementById('colum2n');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[4];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/msitelogin",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>" + data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}

function msiteorder() {
    var txt = document.getElementById('colum2n');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[5];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/msiteorder",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>" + data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}

function msiteordert() {
    var txt = document.getElementById('colum2n');
    var str = txt.innerHTML = "";
    var loginbtn = document.getElementsByTagName('a')[6];
    txt.innerHTML = str + "login start";
    $.ajax({
        type: "GET",
        url: "/msiteordert",
        async: true,
        contentType: "application/json",
        dataType: "json",
        success: function (data) {
            if (data.statuss == "fi") {
                txt.innerHTML = str + "<br>" + "login finish";
                loginbtn.style.color = 'green';
            }
            else {
                txt.innerHTML = str + "<br>" + "login failed" + "<br>" + data.err;
                loginbtn.style.color = 'red';
            }
        },
        error: function (err) {
            alert(err)
        }
    })
}
