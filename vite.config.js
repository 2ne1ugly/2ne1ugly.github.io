import { resolve } from 'path'
import { injectHtml } from 'vite-plugin-html'

const scalaVersion = '2.13'

export default ({ command, mode }) => {
  const mainJS = `/target/scala-${scalaVersion}/me-${mode === 'production' ? 'opt' : 'fastopt'}/main.js`
  console.log('mainJS', mainJS)
  return {
    publicDir: './public',
    plugins: [
      injectHtml({
        injectData: {
          injectScript: `<script type="module" src="${mainJS}"></script>`
        }
      })
    ],
    resolve: {
      alias: {
        'stylesheets': resolve(__dirname, './stylesheets')
      }
    }
  }
}