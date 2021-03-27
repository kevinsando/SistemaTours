
function init() {
    console.log("iniciando...");

    var ctx = document.getElementById('myChart').getContext('2d');
    var chart = new Chart(ctx, {
        // The type of chart we want to create
        type: 'pie',

        // The data for our dataset
        data: {
            labels: ['January', 'February', 'March'],
            datasets: [{
                    label: 'Promedios',
                    backgroundColor: ["rgb(255, 99, 132)","rgb(54, 162, 235)","rgb(255, 205, 86)"],
                    data: [20, 10, 5]
                }]
        },

        // Configuration options go here
        options: {}
    });
}


