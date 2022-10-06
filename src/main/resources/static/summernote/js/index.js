const quillOptions = {
    modules: {
        formula: true,
        imageResize: {
            displaySize: true
        },
        imageDrop: true,
        toolbar: [["image", "bold", "italic", "underline", "formula"]]
    },
    placeholder:
        "Type text here.",
    theme: "snow",
    bounds: "#editor_parent"
};

const options = {};

const enableMathQuillFormulaAuthoring = window.mathquill4quill();
const quill = new Quill("#editor", quillOptions);
enableMathQuillFormulaAuthoring(quill, options);

quill.on('text-change', function(delta, oldDelta, source) {
    if (source == 'api') {
        let contents = quill.root.innerHTML;
        $("#preview_feature").html(contents);
    } else if (source == 'user') {
        let contents = quill.root.innerHTML;
        $("#preview_feature").html(contents);
    }
});