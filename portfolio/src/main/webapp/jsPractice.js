/** Fetches the current date from the server and adds it to the page. */
async function showServerTime() {
  const responseFromServer = await fetch('/current');
  const textFromResponse = await responseFromServer.text();

  const dateContainer = document.getElementById('current-container');
  dateContainer.innerText = textFromResponse;
}
async function showMessage(){
    const resp = await fetch('/random');
     const textFrom = await resp.text();
     const randContainer = document.getElementById('rand-container');
    randContainer.innerText = textFrom;
}
