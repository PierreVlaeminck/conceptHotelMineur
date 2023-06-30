/**
 * Creates a map and initializes it with a centered view on Bretagne.
 */
let map = L.map('mapid').setView([48.3905283, -4.4860088], 8);

/**
 * Adds an OpenStreetMap tile layer to the map.
 */
L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: 'Map data © <a href="https://openstreetmap.org">OpenStreetMap</a> contributors',
    maxZoom: 18
}).addTo(map);

/**
 * Creates an initial marker on the map.
 */
let marker = L.marker([latitudeInput.value, longitudeInput.value]).addTo(map);

<!-- Javascript price slider -->

/**
 * Retrieves the necessary HTML elements for the price slider.
 */
const priceRangeInput = document.getElementById('customRange2');
const priceDisplay = document.getElementById('priceDisplay');

/**
 * Updates the price display based on the position of the slider.
 */
function updatePrice() {
    const price = priceRangeInput.value * 10;
    priceDisplay.textContent = price + '€';
}

/**
 * Adds an event listener to detect changes in the slider position.
 */
priceRangeInput.addEventListener('input', updatePrice);

/**
 * Calls the updatePrice function to display the initial price.
 */
updatePrice();
