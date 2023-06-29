// create a map centered on Bretagne
let map = L.map('mapid').setView([48.3905283, -4.4860088], 8);

// add an OpenStreetMap tile layer to the map.
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: 'Map data © <a href="https://openstreetmap.org">OpenStreetMap</a> contributors',
    maxZoom: 18
}).addTo(map);

// create an initial marker
let marker = L.marker([latitudeInput.value, longitudeInput.value]).addTo(map);
