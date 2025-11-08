
    function convertTemperature() {
      const tempInput = document.getElementById('temperature').value.trim();
      const unit = document.getElementById('unit').value;
      const resultDiv = document.getElementById('result');

      // Validate input
      if (tempInput === '' || isNaN(tempInput)) {
        resultDiv.textContent = '⚠️ Please enter a valid number!';
        resultDiv.style.color = 'red';
        return;
      }

      const temperature = parseFloat(tempInput);
      let convertedTemp;
      let outputUnit;

      if (unit === 'celsius') {
        convertedTemp = (temperature * 9/5) + 32;
        outputUnit = '°F';
      } else {
        convertedTemp = (temperature - 32) * 5/9;
        outputUnit = '°C';
      }

      resultDiv.textContent = `Converted Temperature: ${convertedTemp.toFixed(2)} ${outputUnit}`;
      resultDiv.style.color = '#333';
    }
 