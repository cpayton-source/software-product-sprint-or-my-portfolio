/** Fetches the current date from the server and adds it to the page. */
async function showServerTime() {
  const responseFromServer = await fetch('/current');
  const textFromResponse = await responseFromServer.text();

  const dateContainer = document.getElementById('current-container');
  dateContainer.innerText = textFromResponse;
}
