# Experiment results

## Step 1: Forked repository, enabled dependency graph, enabled GitHub Actions workflows

- 7 dependencies listed in dependency graph. All are for actions used in GHA workflows.

<img width="883" alt="Image" src="https://github.com/user-attachments/assets/74de4350-5169-4eb9-a173-41c80964299c" />

## Step 2: Create (but don't merge) initial pull request

- `Dependency review for pull requests` workflow ran, and submitted dependency-graph for non-default branch.
- Still only 7 dependencies listed in graph.

<img width="1101" alt="Image" src="https://github.com/user-attachments/assets/196ee47d-43cc-4552-8a00-28a04d50bac1" />

## Step 3: Merge initial pull request

- `Dependency Submission` workflow ran, and successfully updated the dependency graph for the repository.

<img width="1077" alt="Image" src="https://github.com/user-attachments/assets/7b0e1c09-2012-4bee-bf10-5040469098de" />

- There are now 58 dependencies in the graph

<img width="888" alt="Image" src="https://github.com/user-attachments/assets/7f76c660-abf7-49ed-9053-2de4495e587c" />

## Step 4: Create (but don't merge) a second pull request

