#!/bin/bash
set -e

rm -rf dist
yarn build

HASH=$(git rev-parse --short HEAD)

pushd dist || exit
touch .nojekyll
git init
git checkout -b gh-pages
git add -A
git commit -m "generated from $HASH"
git remote add origin https://github.com/2ne1ugly/2ne1ugly.github.io.git
git push -f -u origin gh-pages
popd || exit
