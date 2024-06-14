CREATE TABLE people (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    user_id TEXT NOT NULL,
    name TEXT NOT NULL,
    address TEXT,
    FOREIGN KEY (user_id) REFERENCES users(id)
);