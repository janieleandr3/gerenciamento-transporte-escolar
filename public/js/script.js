document.getElementById('formCriarSala').addEventListener('submit', function (e) {
    e.preventDefault();
    
    const cidade = document.getElementById('cidade').value;
    const motorista = document.getElementById('motorista').value;

    fetch('/criarSala', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ cidade, motorista })
    }).then(response => response.json())
      .then(data => {
          window.location.href = `/sala/${data.chaveAcesso}`;
      });
});
