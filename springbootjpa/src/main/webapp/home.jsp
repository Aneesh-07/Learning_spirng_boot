<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Alien Form</title>
</head>
<body class="bg-gray-100 py-10">

    <div class="max-w-lg mx-auto bg-white p-8 rounded-lg shadow-lg">
        <!-- Add Alien Form -->
        <h1 class="text-2xl font-semibold text-gray-700 mb-6">Add Alien</h1>
        <form action="addAlien" class="space-y-4">
            <div>
                <label for="aid" class="block text-sm font-medium text-gray-700">Alien ID</label>
                <input type="text" name="aid" id="aid" class="mt-1 block w-full p-2 border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500">
            </div>

            <div>
                <label for="aname" class="block text-sm font-medium text-gray-700">Alien Name</label>
                <input type="text" name="aname" id="aname" class="mt-1 block w-full p-2 border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500">
            </div>

            <div>
                <label for="tech" class="block text-sm font-medium text-gray-700">Technology</label>
                <input type="text" name="tech" id="tech" class="mt-1 block w-full p-2 border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500">
            </div>

            <div>
                <input type="submit" value="Add Alien" class="w-full bg-blue-500 hover:bg-blue-600 text-white py-2 px-4 rounded-md cursor-pointer font-semibold">
            </div>
        </form>
    </div>

    

    <div class="max-w-lg mx-auto bg-white p-8 rounded-lg shadow-lg mt-10">
        <!-- Get Alien Form -->
        <h1 class="text-2xl font-semibold text-gray-700 mb-6">Get Alien</h1>
        <form action="getAlien" class="space-y-4">
            <div>
                <label for="aid-get" class="block text-sm font-medium text-gray-700">Alien ID</label>
                <input type="text" name="aid" id="aid-get" class="mt-1 block w-full p-2 border border-gray-300 rounded-md focus:outline-none focus:ring-2 focus:ring-blue-500 focus:border-blue-500">
            </div>

            <div>
                <input type="submit" value="Get Alien" class="w-full bg-green-500 hover:bg-green-600 text-white py-2 px-4 rounded-md cursor-pointer font-semibold">
            </div>
        </form>
    </div>

</body>
</html>
