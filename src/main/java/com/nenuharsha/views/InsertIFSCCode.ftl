<html>

<script>
    function validate() {
        var code = document.getElementById("code");
        if(code.value.length <11 || code.value.length>11){
            alert("Enter correct ifsc code!");
            return false;
        }

    }
</script>

<head>
    <title> IFSC Code </title>
</head>

<body>
    <h1>Enter the IFSC Code!</h1><br />
    <form action="/ifsc" method="post" onsubmit="return validate()">
        Enter here: <input title="IFSC code" style="text-transform:uppercase" id="code" name="code" /><br />
        <br />
        <input type="submit" value="Submit" />
    </form>
</body>

</html>