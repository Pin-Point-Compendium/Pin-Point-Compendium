class Click {
    displayedElement;

    displayElement(id, displayStyle) {
        this.displayedElement = document.getElementById(id);
        this.displayedElement.style.display = displayStyle;
    }

    hideDisplayedElement() {
        this.displayedElement.style.display = "none";
    }
}


const addNewButton = document.getElementById("add-new")
const clickHolder = new Click()
addNewButton.addEventListener("click", function () {
    console.log("clicked")
    clickHolder.displayElement("add-new-list", "block");
})
// document.addEventListener("click", function () {
//     console.log("document clicked")
//     clickHolder.hideDisplayedElement()
// })