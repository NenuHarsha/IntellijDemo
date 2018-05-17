<!DOCTYPE html>
<html>
    <head>
        <title>IFSC Details</title>
    </head>
    <body>
    <form action="/ifsc/insert" method="get">
        <table border="2">
            <tr>
                <td>IFSC Code</td>
                <td>${ifsc.IFSC}</td>
            </tr>
            <tr>
                <td>Branch</td>
                <td>${ifsc.BRANCH}</td>
            </tr>
            <tr>
                <td>Contact</td>
                <td>${ifsc.CONTACT}</td>
            </tr>
            <tr>
                <td>City</td>
                <td>${ifsc.CITY}</td>
            </tr>
            <tr>
                <td>District</td>
                <td>${ifsc.DISTRICT}</td>
            </tr>
            <tr>
                <td>State</td>
                <td>${ifsc.STATE}</td>
            </tr>
            <tr>
                <td>RTGS</td>
                <td>${ifsc.RTGS?c}</td>
            </tr>
            <tr>
                <td>Bank</td>
                <td>${ifsc.BANK}</td>
            </tr>
            <tr>
                <td>Bank Code</td>
                <td>${ifsc.BANKCODE}</td>
            </tr>
            <tr>
                <td>Address</td>
                <td>${ifsc.ADDRESS}</td>
            </tr>
        </table>
    <input type="submit" value="Go Back!">
    </form>
    </body>
</html>