<!DOCTYPE html>
<html lang="en">
<head>
    <title>${title}</title>
    <style>
        body {
            font-family: Arial, sans-serif;
        }
        h1 {
            color: blue;
        }
        table {
            width: 100%;
            border-collapse: collapse;
        }
        th, td {
            border: 1px solid black;
            padding: 8px;
            text-align: left;
        }
        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
    <h1>Hello, ${name}!</h1>
    <h2>Fruit names:</h2>
    <ul>
      <#list fruits as fruit>
          <li>${fruit}</li>
      </#list>
    </ul>
    <h2>Table of users</h2>
    <table>
        <tr>
            <th>Name</th>
            <th>Email</th>
            <th>Address</th>
            <th>Phone</th>
            <th>Two-Factor</th>
        </tr>
        <#list users as user>
        <tr>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.address}</td>
            <td>${user.phone}</td>
            <td>
              <#if user.twoFactor>
                  Enabled
              <#else>
                  Must be configured!
              </#if>
            </td>
        </tr>
        </#list>
    </table>
    <p>Total of users: ${users?size}</p>
</body>
</html>