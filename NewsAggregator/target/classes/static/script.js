document.addEventListener('DOMContentLoaded', function() {
    fetch('/api/articles')
        .then(response => response.json())
        .then(articles => {
            const articlesContainer = document.getElementById('articles');
            articles.forEach(article => {
                const articleElement = document.createElement('article');
                articleElement.innerHTML = `
                    <h2>${article.title}</h2>
                    <p>${article.content}</p>
                    <p><small>Source: ${article.source} | Published at: ${new Date(article.publishedAt).toLocaleString()}</small></p>
                `;
                articlesContainer.appendChild(articleElement);
            });
        })
        .catch(error => console.error('Error fetching articles:', error));
});
