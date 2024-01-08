import './styles.css';

// The function execute when the add button is clicked.
const onClickAdd = () => {
    const textEl = document.getElementById("add-text");                 // Get the element of the text box.
    const text = textEl.value;                                          // Get the value of the text box.
    textEl.value = "";                                                  // Initialize the text box with a blank value.
    const li = document.createElement("li");                            // Create an <li> tag. 
    const div = document.createElement("div");                          // Create an <div> tag. 
    const p = document.createElement("p");                              // Create an <p> tag.
    p.textContent = text;
  
    const button = document.createElement("button");                     // Create an button at "delete".
    button.textContent = "delete";
  
    //The method for the "delete" button
    button.addEventListener("click", () => {                             // Handle row deletion.
      const deleteTarget = button.closest("li");                         // Get the <li> element for the row to be deletion.
      document.getElementById("memo-list").removeChild(deleteTarget);    // Delete a specific row from under the '<ul>'tag.[*"memo-list" is id of <ul> tag.]
    });
  

    div.appendChild(p);                                                  // Set up the '<div>' tag beneath the '<button>' and '<p>' tags.
    div.appendChild(button);
  
    li.appendChild(div);                                                 // Set up <div> tag. 
    document.getElementById("memo-list").appendChild(li);                
};
  
  document                                                               // Set up the 'onClickAdd' function when [add] button clicked.
    .getElementById("add-button")
    .addEventListener("click", () => onClickAdd());
  