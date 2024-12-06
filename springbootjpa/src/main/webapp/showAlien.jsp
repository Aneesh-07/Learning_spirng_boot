<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Alien Details</title>
</head>
<body class="bg-gray-100 py-10">

    <div class="max-w-md mx-auto bg-white p-8 rounded-lg shadow-lg">
        <h1 class="text-2xl font-semibold text-gray-700 mb-4">Alien Details</h1>
        
        <p class="text-lg text-gray-600 mb-6">
            <span class="font-medium text-gray-800">Alien ID:</span> ${alien.aid} <br>
            <span class="font-medium text-gray-800">Alien Name:</span> ${alien.aname} <br>
            <span class="font-medium text-gray-800">Technology:</span> ${alien.tech}
        </p>

        <form action="popAlien">

            <input type="hidden" name="aid" value="${alien.aid}">
            <input type="submit" value="Delete Alien" class="w-full bg-red-500 hover:bg-red-600 text-white py-2 px-4 rounded-md cursor-pointer font-semibold">
        </form>
    </div>

</body>
</html>
