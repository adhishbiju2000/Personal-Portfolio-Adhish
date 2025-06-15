document.addEventListener("DOMContentLoaded", () => {
    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('animate');
            } else {
                entry.target.classList.remove('animate'); // Remove this line if you want animation only once
            }
        });
    }, {
        threshold: 0.5 // Adjust if needed: 0 = enters viewport, 1 = fully visible
    });

    const introElement = document.querySelector('.intro');
    if (introElement) {
        observer.observe(introElement);
    }
});
