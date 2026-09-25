fetch("https://api.github.com/users/EduardoSerranos/repos")
    .then(response => response.json())
    .then(repos => {

        const container = document.getElementById("github-projects");

        container.innerHTML = "";

        repos
            .filter(repo => repo.name.toLowerCase().includes("project"))
            .forEach(repo => {

                const project = document.createElement("div");

                project.innerHTML = `
                    <h3>${repo.name}</h3>
                    <p>${repo.description || "No description available."}</p>
                `;

                container.appendChild(project);
            });
        })
        .catch(error => {
            console.log("Error:", error);
    });