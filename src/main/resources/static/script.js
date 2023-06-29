// create a map centered on Bretagne
let map = L.map('mapid').setView([48.3905283, -4.4860088], 8);

// add an OpenStreetMap tile layer to the map.
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: 'Map data © <a href="https://openstreetmap.org">OpenStreetMap</a> contributors',
    maxZoom: 18
}).addTo(map);

// create an initial marker
let marker = L.marker([latitudeInput.value, longitudeInput.value]).addTo(map);

<!-- Javascript barre de prix -->

// Récupérer les éléments HTML nécessaires
const rangeInput = document.getElementById('customRange2');
const priceDisplay = document.getElementById('priceDisplay');

// Définir une fonction pour mettre à jour le prix
function updatePrice() {
    const price = rangeInput.value * 10; // Exemple : prix = position du curseur * 10
    priceDisplay.textContent = price + '€';
}

// Ajouter un gestionnaire d'événement pour détecter les changements de position du curseur
rangeInput.addEventListener('input', updatePrice);

// Appeler la fonction updatePrice pour afficher le prix initial
updatePrice();
