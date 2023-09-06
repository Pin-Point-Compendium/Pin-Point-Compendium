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

