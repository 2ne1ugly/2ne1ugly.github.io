#!/bin/bash
set -e

rm -rf dist
vite build

HASH=$(git rev-parse --short HEAD)

pushd dist || exit
touch .nojekyll
git init
git checkout -b gh-pages
git add -A
git commit -m "generated from $HASH"
git remote add origin https://github.com/2ne1ugly/me.git
git push -f -u origin gh-pages
popd || exit
