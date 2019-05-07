<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    {{-- <script type="text/javascript">
        function sendData(){
            var xhr = new XMLHttpRequest();
            xhr.open('POST', 'http://192.168.1.4:7777/quanlycafe/public/api/login', false);
            xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
            xhr.onreadystatechange = function() {
                if (xhr.readyState == 4) {
                    console.log(xhr);
                }
            }
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            var params = "username=" + username + "&password=" + password;
            xhr.send(params);
        } 
    </script> --}}
</head>
<body>
        {{-- <input type="text" id="username" name="username">
        <input type="text" id="password" name="password">
        <button onclick="javascript:sendData()">Click</button> --}}
        <form action="api/statistic/products" method="post">
            {{-- <input type="text" name="id_table"> <br>
            <input type="text" name="id_user"> <br> --}}
            <input type="text" name="start_day"> <br>
            <input type="text" name="end_day"> <br>
            <input type="submit" value="Send">
        </form>
</body>
</html>