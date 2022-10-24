FROM node:alpine
WORKDIR /app
COPY package.json .
COPY package-lock.json .
RUN npm install --legacy-peer-deps
COPY . . 
EXPOSE 4200
CMD /app/node_modules/.bin/ng serve --host 0.0.0.0 --disableHostCheck
